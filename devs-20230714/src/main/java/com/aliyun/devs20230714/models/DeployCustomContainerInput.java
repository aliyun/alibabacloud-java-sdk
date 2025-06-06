// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployCustomContainerInput extends TeaModel {
    @NameInMap("accountID")
    public String accountID;

    @NameInMap("asyncInvokeConfig")
    public DeployCustomContainerInputAsyncInvokeConfig asyncInvokeConfig;

    @NameInMap("concurrencyConfig")
    public DeployCustomContainerInputConcurrencyConfig concurrencyConfig;

    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("customContainerConfig")
    public DeployCustomContainerInputCustomContainerConfig customContainerConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("envName")
    public String envName;

    @NameInMap("environmentVariables")
    public java.util.Map<String, ?> environmentVariables;

    @NameInMap("gpuConfig")
    public DeployCustomContainerInputGpuConfig gpuConfig;

    @NameInMap("httpTrigger")
    public DeployCustomContainerInputHttpTrigger httpTrigger;

    @NameInMap("logConfig")
    public DeployCustomContainerInputLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("modelConfig")
    public DeployCustomContainerInputModelConfig modelConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nasConfig")
    public DeployCustomContainerInputNasConfig nasConfig;

    @NameInMap("originalName")
    public String originalName;

    @NameInMap("ossMountConfig")
    public DeployCustomContainerInputOssMountConfig ossMountConfig;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("provisionConfig")
    public DeployCustomContainerInputProvisionConfig provisionConfig;

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
    public DeployCustomContainerInputVpcConfig vpcConfig;

    public static DeployCustomContainerInput build(java.util.Map<String, ?> map) throws Exception {
        DeployCustomContainerInput self = new DeployCustomContainerInput();
        return TeaModel.build(map, self);
    }

    public DeployCustomContainerInput setAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }
    public String getAccountID() {
        return this.accountID;
    }

    public DeployCustomContainerInput setAsyncInvokeConfig(DeployCustomContainerInputAsyncInvokeConfig asyncInvokeConfig) {
        this.asyncInvokeConfig = asyncInvokeConfig;
        return this;
    }
    public DeployCustomContainerInputAsyncInvokeConfig getAsyncInvokeConfig() {
        return this.asyncInvokeConfig;
    }

    public DeployCustomContainerInput setConcurrencyConfig(DeployCustomContainerInputConcurrencyConfig concurrencyConfig) {
        this.concurrencyConfig = concurrencyConfig;
        return this;
    }
    public DeployCustomContainerInputConcurrencyConfig getConcurrencyConfig() {
        return this.concurrencyConfig;
    }

    public DeployCustomContainerInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public DeployCustomContainerInput setCustomContainerConfig(DeployCustomContainerInputCustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public DeployCustomContainerInputCustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public DeployCustomContainerInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployCustomContainerInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DeployCustomContainerInput setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DeployCustomContainerInput setEnvironmentVariables(java.util.Map<String, ?> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, ?> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public DeployCustomContainerInput setGpuConfig(DeployCustomContainerInputGpuConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public DeployCustomContainerInputGpuConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployCustomContainerInput setHttpTrigger(DeployCustomContainerInputHttpTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public DeployCustomContainerInputHttpTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public DeployCustomContainerInput setLogConfig(DeployCustomContainerInputLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public DeployCustomContainerInputLogConfig getLogConfig() {
        return this.logConfig;
    }

    public DeployCustomContainerInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DeployCustomContainerInput setModelConfig(DeployCustomContainerInputModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public DeployCustomContainerInputModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public DeployCustomContainerInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployCustomContainerInput setNasConfig(DeployCustomContainerInputNasConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public DeployCustomContainerInputNasConfig getNasConfig() {
        return this.nasConfig;
    }

    public DeployCustomContainerInput setOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    public String getOriginalName() {
        return this.originalName;
    }

    public DeployCustomContainerInput setOssMountConfig(DeployCustomContainerInputOssMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public DeployCustomContainerInputOssMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public DeployCustomContainerInput setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeployCustomContainerInput setProvisionConfig(DeployCustomContainerInputProvisionConfig provisionConfig) {
        this.provisionConfig = provisionConfig;
        return this;
    }
    public DeployCustomContainerInputProvisionConfig getProvisionConfig() {
        return this.provisionConfig;
    }

    public DeployCustomContainerInput setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeployCustomContainerInput setReportStatusURL(String reportStatusURL) {
        this.reportStatusURL = reportStatusURL;
        return this;
    }
    public String getReportStatusURL() {
        return this.reportStatusURL;
    }

    public DeployCustomContainerInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DeployCustomContainerInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeployCustomContainerInput setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DeployCustomContainerInput setVpcConfig(DeployCustomContainerInputVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public DeployCustomContainerInputVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure extends TeaModel {
        @NameInMap("destination")
        public String destination;

        public static DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure self = new DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

    }

    public static class DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess extends TeaModel {
        @NameInMap("destination")
        public String destination;

        public static DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess self = new DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

    }

    public static class DeployCustomContainerInputAsyncInvokeConfigDestinationConfig extends TeaModel {
        @NameInMap("onFailure")
        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure onFailure;

        @NameInMap("onSuccess")
        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess onSuccess;

        public static DeployCustomContainerInputAsyncInvokeConfigDestinationConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputAsyncInvokeConfigDestinationConfig self = new DeployCustomContainerInputAsyncInvokeConfigDestinationConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfig setOnFailure(DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }
        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnFailure getOnFailure() {
            return this.onFailure;
        }

        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfig setOnSuccess(DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }
        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfigOnSuccess getOnSuccess() {
            return this.onSuccess;
        }

    }

    public static class DeployCustomContainerInputAsyncInvokeConfig extends TeaModel {
        @NameInMap("asyncTask")
        public Boolean asyncTask;

        @NameInMap("destinationConfig")
        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfig destinationConfig;

        @NameInMap("maxAsyncEventAgeInSeconds")
        public Long maxAsyncEventAgeInSeconds;

        @NameInMap("maxAsyncRetryAttempts")
        public Long maxAsyncRetryAttempts;

        public static DeployCustomContainerInputAsyncInvokeConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputAsyncInvokeConfig self = new DeployCustomContainerInputAsyncInvokeConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputAsyncInvokeConfig setAsyncTask(Boolean asyncTask) {
            this.asyncTask = asyncTask;
            return this;
        }
        public Boolean getAsyncTask() {
            return this.asyncTask;
        }

        public DeployCustomContainerInputAsyncInvokeConfig setDestinationConfig(DeployCustomContainerInputAsyncInvokeConfigDestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }
        public DeployCustomContainerInputAsyncInvokeConfigDestinationConfig getDestinationConfig() {
            return this.destinationConfig;
        }

        public DeployCustomContainerInputAsyncInvokeConfig setMaxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }
        public Long getMaxAsyncEventAgeInSeconds() {
            return this.maxAsyncEventAgeInSeconds;
        }

        public DeployCustomContainerInputAsyncInvokeConfig setMaxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }
        public Long getMaxAsyncRetryAttempts() {
            return this.maxAsyncRetryAttempts;
        }

    }

    public static class DeployCustomContainerInputConcurrencyConfig extends TeaModel {
        @NameInMap("reservedConcurrency")
        public Integer reservedConcurrency;

        public static DeployCustomContainerInputConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputConcurrencyConfig self = new DeployCustomContainerInputConcurrencyConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputConcurrencyConfig setReservedConcurrency(Integer reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }
        public Integer getReservedConcurrency() {
            return this.reservedConcurrency;
        }

    }

    public static class DeployCustomContainerInputCustomContainerConfigHealthCheckConfig extends TeaModel {
        @NameInMap("failureThreshold")
        public Integer failureThreshold;

        @NameInMap("httpGetUrl")
        public String httpGetUrl;

        @NameInMap("initialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("periodSeconds")
        public Integer periodSeconds;

        @NameInMap("successThreshold")
        public Integer successThreshold;

        @NameInMap("timeoutSeconds")
        public Long timeoutSeconds;

        public static DeployCustomContainerInputCustomContainerConfigHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputCustomContainerConfigHealthCheckConfig self = new DeployCustomContainerInputCustomContainerConfigHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig setHttpGetUrl(String httpGetUrl) {
            this.httpGetUrl = httpGetUrl;
            return this;
        }
        public String getHttpGetUrl() {
            return this.httpGetUrl;
        }

        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig setTimeoutSeconds(Long timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer extends TeaModel {
        @NameInMap("handler")
        public String handler;

        @NameInMap("timeout")
        public Integer timeout;

        public static DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer self = new DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop extends TeaModel {
        @NameInMap("handler")
        public String handler;

        @NameInMap("timeout")
        public Integer timeout;

        public static DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop self = new DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig extends TeaModel {
        @NameInMap("initializer")
        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer initializer;

        @NameInMap("preStop")
        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop preStop;

        public static DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig self = new DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig setInitializer(DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer initializer) {
            this.initializer = initializer;
            return this;
        }
        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigInitializer getInitializer() {
            return this.initializer;
        }

        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig setPreStop(DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop preStop) {
            this.preStop = preStop;
            return this;
        }
        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfigPreStop getPreStop() {
            return this.preStop;
        }

    }

    public static class DeployCustomContainerInputCustomContainerConfig extends TeaModel {
        @NameInMap("command")
        public java.util.List<String> command;

        @NameInMap("entrypoint")
        public java.util.List<String> entrypoint;

        @NameInMap("healthCheckConfig")
        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig healthCheckConfig;

        @NameInMap("image")
        public String image;

        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        @NameInMap("instanceLifecycleConfig")
        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig instanceLifecycleConfig;

        @NameInMap("port")
        public Integer port;

        @NameInMap("role")
        public String role;

        public static DeployCustomContainerInputCustomContainerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputCustomContainerConfig self = new DeployCustomContainerInputCustomContainerConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputCustomContainerConfig setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public DeployCustomContainerInputCustomContainerConfig setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public DeployCustomContainerInputCustomContainerConfig setHealthCheckConfig(DeployCustomContainerInputCustomContainerConfigHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public DeployCustomContainerInputCustomContainerConfigHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public DeployCustomContainerInputCustomContainerConfig setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DeployCustomContainerInputCustomContainerConfig setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public DeployCustomContainerInputCustomContainerConfig setInstanceLifecycleConfig(DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig instanceLifecycleConfig) {
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }
        public DeployCustomContainerInputCustomContainerConfigInstanceLifecycleConfig getInstanceLifecycleConfig() {
            return this.instanceLifecycleConfig;
        }

        public DeployCustomContainerInputCustomContainerConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DeployCustomContainerInputCustomContainerConfig setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DeployCustomContainerInputGpuConfig extends TeaModel {
        @NameInMap("gpuMemorySize")
        public Long gpuMemorySize;

        @NameInMap("gpuType")
        public String gpuType;

        public static DeployCustomContainerInputGpuConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputGpuConfig self = new DeployCustomContainerInputGpuConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputGpuConfig setGpuMemorySize(Long gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Long getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public DeployCustomContainerInputGpuConfig setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

    }

    public static class DeployCustomContainerInputHttpTriggerTriggerConfig extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("disableURLInternet")
        public Boolean disableURLInternet;

        @NameInMap("dsableURLInternet")
        public Boolean dsableURLInternet;

        @NameInMap("methods")
        public java.util.List<String> methods;

        public static DeployCustomContainerInputHttpTriggerTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputHttpTriggerTriggerConfig self = new DeployCustomContainerInputHttpTriggerTriggerConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputHttpTriggerTriggerConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DeployCustomContainerInputHttpTriggerTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }
        public Boolean getDisableURLInternet() {
            return this.disableURLInternet;
        }

        public DeployCustomContainerInputHttpTriggerTriggerConfig setDsableURLInternet(Boolean dsableURLInternet) {
            this.dsableURLInternet = dsableURLInternet;
            return this;
        }
        public Boolean getDsableURLInternet() {
            return this.dsableURLInternet;
        }

        public DeployCustomContainerInputHttpTriggerTriggerConfig setMethods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<String> getMethods() {
            return this.methods;
        }

    }

    public static class DeployCustomContainerInputHttpTrigger extends TeaModel {
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("triggerConfig")
        public DeployCustomContainerInputHttpTriggerTriggerConfig triggerConfig;

        public static DeployCustomContainerInputHttpTrigger build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputHttpTrigger self = new DeployCustomContainerInputHttpTrigger();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputHttpTrigger setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public DeployCustomContainerInputHttpTrigger setTriggerConfig(DeployCustomContainerInputHttpTriggerTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public DeployCustomContainerInputHttpTriggerTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class DeployCustomContainerInputLogConfig extends TeaModel {
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

        public static DeployCustomContainerInputLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputLogConfig self = new DeployCustomContainerInputLogConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputLogConfig setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public DeployCustomContainerInputLogConfig setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public DeployCustomContainerInputLogConfig setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public DeployCustomContainerInputLogConfig setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public DeployCustomContainerInputLogConfig setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class DeployCustomContainerInputModelConfig extends TeaModel {
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

        public static DeployCustomContainerInputModelConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputModelConfig self = new DeployCustomContainerInputModelConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputModelConfig setFramework(String framework) {
            this.framework = framework;
            return this;
        }
        public String getFramework() {
            return this.framework;
        }

        public DeployCustomContainerInputModelConfig setMultiModelConfig(java.util.List<ModelConfig> multiModelConfig) {
            this.multiModelConfig = multiModelConfig;
            return this;
        }
        public java.util.List<ModelConfig> getMultiModelConfig() {
            return this.multiModelConfig;
        }

        public DeployCustomContainerInputModelConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DeployCustomContainerInputModelConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeployCustomContainerInputModelConfig setSrcModelScopeModelID(String srcModelScopeModelID) {
            this.srcModelScopeModelID = srcModelScopeModelID;
            return this;
        }
        public String getSrcModelScopeModelID() {
            return this.srcModelScopeModelID;
        }

        public DeployCustomContainerInputModelConfig setSrcModelScopeModelRevision(String srcModelScopeModelRevision) {
            this.srcModelScopeModelRevision = srcModelScopeModelRevision;
            return this;
        }
        public String getSrcModelScopeModelRevision() {
            return this.srcModelScopeModelRevision;
        }

        public DeployCustomContainerInputModelConfig setSrcModelScopeToken(String srcModelScopeToken) {
            this.srcModelScopeToken = srcModelScopeToken;
            return this;
        }
        public String getSrcModelScopeToken() {
            return this.srcModelScopeToken;
        }

        public DeployCustomContainerInputModelConfig setSrcOssBucket(String srcOssBucket) {
            this.srcOssBucket = srcOssBucket;
            return this;
        }
        public String getSrcOssBucket() {
            return this.srcOssBucket;
        }

        public DeployCustomContainerInputModelConfig setSrcOssPath(String srcOssPath) {
            this.srcOssPath = srcOssPath;
            return this;
        }
        public String getSrcOssPath() {
            return this.srcOssPath;
        }

        public DeployCustomContainerInputModelConfig setSrcOssRegion(String srcOssRegion) {
            this.srcOssRegion = srcOssRegion;
            return this;
        }
        public String getSrcOssRegion() {
            return this.srcOssRegion;
        }

        public DeployCustomContainerInputModelConfig setSyncStrategy(String syncStrategy) {
            this.syncStrategy = syncStrategy;
            return this;
        }
        public String getSyncStrategy() {
            return this.syncStrategy;
        }

    }

    public static class DeployCustomContainerInputNasConfig extends TeaModel {
        @NameInMap("groupId")
        public Long groupId;

        @NameInMap("mountPoints")
        public java.util.List<String> mountPoints;

        @NameInMap("userId")
        public Long userId;

        public static DeployCustomContainerInputNasConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputNasConfig self = new DeployCustomContainerInputNasConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputNasConfig setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DeployCustomContainerInputNasConfig setMountPoints(java.util.List<String> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<String> getMountPoints() {
            return this.mountPoints;
        }

        public DeployCustomContainerInputNasConfig setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class DeployCustomContainerInputOssMountConfigMountPoints extends TeaModel {
        @NameInMap("bucketName")
        public String bucketName;

        @NameInMap("bucketPath")
        public String bucketPath;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("readOnly")
        public Boolean readOnly;

        public static DeployCustomContainerInputOssMountConfigMountPoints build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputOssMountConfigMountPoints self = new DeployCustomContainerInputOssMountConfigMountPoints();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputOssMountConfigMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DeployCustomContainerInputOssMountConfigMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public DeployCustomContainerInputOssMountConfigMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DeployCustomContainerInputOssMountConfigMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public DeployCustomContainerInputOssMountConfigMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class DeployCustomContainerInputOssMountConfig extends TeaModel {
        @NameInMap("mountPoints")
        public java.util.List<DeployCustomContainerInputOssMountConfigMountPoints> mountPoints;

        public static DeployCustomContainerInputOssMountConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputOssMountConfig self = new DeployCustomContainerInputOssMountConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputOssMountConfig setMountPoints(java.util.List<DeployCustomContainerInputOssMountConfigMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<DeployCustomContainerInputOssMountConfigMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class DeployCustomContainerInputProvisionConfigScheduledActions extends TeaModel {
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

        public static DeployCustomContainerInputProvisionConfigScheduledActions build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputProvisionConfigScheduledActions self = new DeployCustomContainerInputProvisionConfigScheduledActions();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputProvisionConfigScheduledActions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DeployCustomContainerInputProvisionConfigScheduledActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeployCustomContainerInputProvisionConfigScheduledActions setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public DeployCustomContainerInputProvisionConfigScheduledActions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeployCustomContainerInputProvisionConfigScheduledActions setTarget(Integer target) {
            this.target = target;
            return this;
        }
        public Integer getTarget() {
            return this.target;
        }

        public DeployCustomContainerInputProvisionConfigScheduledActions setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DeployCustomContainerInputProvisionConfig extends TeaModel {
        @NameInMap("alwaysAllocateGPU")
        public Boolean alwaysAllocateGPU;

        @NameInMap("scheduledActions")
        public java.util.List<DeployCustomContainerInputProvisionConfigScheduledActions> scheduledActions;

        @NameInMap("target")
        public Long target;

        public static DeployCustomContainerInputProvisionConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputProvisionConfig self = new DeployCustomContainerInputProvisionConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputProvisionConfig setAlwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }
        public Boolean getAlwaysAllocateGPU() {
            return this.alwaysAllocateGPU;
        }

        public DeployCustomContainerInputProvisionConfig setScheduledActions(java.util.List<DeployCustomContainerInputProvisionConfigScheduledActions> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }
        public java.util.List<DeployCustomContainerInputProvisionConfigScheduledActions> getScheduledActions() {
            return this.scheduledActions;
        }

        public DeployCustomContainerInputProvisionConfig setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

    }

    public static class DeployCustomContainerInputVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static DeployCustomContainerInputVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerInputVpcConfig self = new DeployCustomContainerInputVpcConfig();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerInputVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeployCustomContainerInputVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DeployCustomContainerInputVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
