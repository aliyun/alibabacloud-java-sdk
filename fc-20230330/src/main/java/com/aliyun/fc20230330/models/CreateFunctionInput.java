// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateFunctionInput extends TeaModel {
    /**
     * <p>The ZIP package of the function code. Specify either code or customContainerConfig.</p>
     */
    @NameInMap("code")
    public InputCodeLocation code;

    /**
     * <p>The CPU specification of the function, in vCPUs. The value must be a multiple of 0.05 vCPU. Minimum value: 0.05. Maximum value: 16. The ratio of cpu to memorySize (in GB) must be between 1:1 and 1:4.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The configuration for the custom container runtime. After this parameter is configured, the function can use a custom container image for execution. Specify either code or customContainerConfig.</p>
     */
    @NameInMap("customContainerConfig")
    public CustomContainerConfig customContainerConfig;

    /**
     * <p>The custom DNS configuration.</p>
     */
    @NameInMap("customDNS")
    public CustomDNS customDNS;

    /**
     * <p>The custom runtime configuration.</p>
     */
    @NameInMap("customRuntimeConfig")
    public CustomRuntimeConfig customRuntimeConfig;

    /**
     * <p>The description of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>my function</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable STS token injection. Valid values:</p>
     * <ul>
     * <li>None: STS tokens are injected in all methods.</li>
     * <li>Env: STS tokens are not injected through environment variables.</li>
     * <li>Request: STS tokens are not injected in requests, including context and headers.</li>
     * <li>All: STS tokens are not injected in any method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Env</p>
     */
    @NameInMap("disableInjectCredentials")
    public String disableInjectCredentials;

    /**
     * <p>Specifies whether to disable the creation of on-demand instances. If this feature is enabled, on-demand instances are not created and only provisioned instances can be used.</p>
     */
    @NameInMap("disableOndemand")
    @Deprecated
    public Boolean disableOndemand;

    /**
     * <p>The disk specification of the function, in MB. Valid values: 512 and 10240.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>Specifies whether to allow provisioned instances of GPU functions to be long-running. When this feature is enabled, function instances are not injected with STS tokens.</p>
     */
    @NameInMap("enableLongLiving")
    @Deprecated
    public Boolean enableLongLiving;

    /**
     * <p>The environment variables of the function. You can access the configured environment variables in the runtime environment.</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The name of the function. The name can contain only letters, digits, underscores (_), and hyphens (-). The name cannot start with a digit or hyphen (-). The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-function-1</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The GPU configuration of the function.</p>
     */
    @NameInMap("gpuConfig")
    public GPUConfig gpuConfig;

    /**
     * <p>The function entry point. The specific format depends on the runtime.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>index.handler</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The deferred release time of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("idleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The maximum concurrency of an instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("instanceConcurrency")
    public Integer instanceConcurrency;

    /**
     * <p>The instance isolation mode.</p>
     */
    @NameInMap("instanceIsolationMode")
    public String instanceIsolationMode;

    /**
     * <p>The instance lifecycle hook configuration.</p>
     */
    @NameInMap("instanceLifecycleConfig")
    public InstanceLifecycleConfig instanceLifecycleConfig;

    /**
     * <p>Specifies whether the function can access the Internet. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    @NameInMap("juiceFsConfig")
    public JuiceFsConfig juiceFsConfig;

    /**
     * <p>The list of layers. Multiple layers are merged in descending order of array index. Files in a layer with a smaller index overwrite files with the same name in a layer with a larger index.</p>
     */
    @NameInMap("layers")
    public java.util.List<String> layers;

    /**
     * <p>The log configuration. Logs generated by the function are written to the configured Logstore.</p>
     */
    @NameInMap("logConfig")
    public LogConfig logConfig;

    /**
     * <p>The memory specification of the function, in MB. The value must be a multiple of 64 MB. Minimum value: 128. Maximum value: 32768 (32 GB). The ratio of cpu to memorySize (in GB) must be between 1:1 and 1:4.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("microSandboxConfig")
    public MicroSandboxConfig microSandboxConfig;

    /**
     * <p>The NAS configuration. After this parameter is configured, the function can access the specified NAS resources.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The OSS mount configuration.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The PolarFs configuration. After this parameter is configured, the function can access the specified PolarFs resources.</p>
     */
    @NameInMap("polarFsConfig")
    public PolarFsConfig polarFsConfig;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The RAM role that the user grants to Function Compute. After this parameter is set, Function Compute assumes this role to generate temporary access credentials. You can use the temporary access credentials of this role in the function to access specified Alibaba Cloud services, such as OSS and OTS.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::188077086902****:role/fc-test</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The runtime environment of the function. Supported runtimes: nodejs12, nodejs14, nodejs16, nodejs18, nodejs20, go1, python3, python3.9, python3.10, python3.12, java8, java11, php7.2, dotnetcore3.1, custom, custom.debian10, custom.debian11, custom.debian12, and custom-container.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>python3.10</p>
     */
    @NameInMap("runtime")
    public String runtime;

    /**
     * <p>The affinity policy for Function Compute invocation requests. To implement request affinity for the MCP SSE protocol, set this parameter to MCP_SSE. To use cookie-based affinity, set this parameter to GENERATED_COOKIE. To use header-based affinity, set this parameter to HEADER_FIELD. If this parameter is not set or is set to NONE, no affinity is applied and requests are routed based on the default scheduling policy of Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>MCP_SSE</p>
     */
    @NameInMap("sessionAffinity")
    public String sessionAffinity;

    /**
     * <p>The affinity configuration that corresponds to the sessionAffinity type. For MCP_SSE affinity, specify MCPSSESessionAffinityConfig. For cookie-based affinity, specify CookieSessionAffinityConfig. For header field affinity, specify HeaderFieldSessionAffinityConfig.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;sseEndpointPath\&quot;:\&quot;/sse\&quot;, \&quot;sessionConcurrencyPerInstance\&quot;:20}</p>
     */
    @NameInMap("sessionAffinityConfig")
    public String sessionAffinityConfig;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The timeout period for function execution, in seconds. Minimum value: 1. Maximum value: 86400. Default value: 3. The function is terminated if it exceeds this time limit.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The Tracing Analysis configuration. After Function Compute is integrated with Tracing Analysis, you can record the time consumed by requests in Function Compute, view the cold start time of functions, and record the time consumed within functions.</p>
     */
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    /**
     * <p>The VPC configuration. After this parameter is configured, the function can access the specified VPC resources.</p>
     */
    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static CreateFunctionInput build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionInput self = new CreateFunctionInput();
        return TeaModel.build(map, self);
    }

    public CreateFunctionInput setCode(InputCodeLocation code) {
        this.code = code;
        return this;
    }
    public InputCodeLocation getCode() {
        return this.code;
    }

    public CreateFunctionInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateFunctionInput setCustomContainerConfig(CustomContainerConfig customContainerConfig) {
        this.customContainerConfig = customContainerConfig;
        return this;
    }
    public CustomContainerConfig getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    public CreateFunctionInput setCustomDNS(CustomDNS customDNS) {
        this.customDNS = customDNS;
        return this;
    }
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    public CreateFunctionInput setCustomRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
        this.customRuntimeConfig = customRuntimeConfig;
        return this;
    }
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    public CreateFunctionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunctionInput setDisableInjectCredentials(String disableInjectCredentials) {
        this.disableInjectCredentials = disableInjectCredentials;
        return this;
    }
    public String getDisableInjectCredentials() {
        return this.disableInjectCredentials;
    }

    @Deprecated
    public CreateFunctionInput setDisableOndemand(Boolean disableOndemand) {
        this.disableOndemand = disableOndemand;
        return this;
    }
    public Boolean getDisableOndemand() {
        return this.disableOndemand;
    }

    public CreateFunctionInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    @Deprecated
    public CreateFunctionInput setEnableLongLiving(Boolean enableLongLiving) {
        this.enableLongLiving = enableLongLiving;
        return this;
    }
    public Boolean getEnableLongLiving() {
        return this.enableLongLiving;
    }

    public CreateFunctionInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateFunctionInput setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public CreateFunctionInput setGpuConfig(GPUConfig gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public GPUConfig getGpuConfig() {
        return this.gpuConfig;
    }

    public CreateFunctionInput setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public CreateFunctionInput setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateFunctionInput setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public CreateFunctionInput setInstanceIsolationMode(String instanceIsolationMode) {
        this.instanceIsolationMode = instanceIsolationMode;
        return this;
    }
    public String getInstanceIsolationMode() {
        return this.instanceIsolationMode;
    }

    public CreateFunctionInput setInstanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
        this.instanceLifecycleConfig = instanceLifecycleConfig;
        return this;
    }
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    public CreateFunctionInput setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public CreateFunctionInput setJuiceFsConfig(JuiceFsConfig juiceFsConfig) {
        this.juiceFsConfig = juiceFsConfig;
        return this;
    }
    public JuiceFsConfig getJuiceFsConfig() {
        return this.juiceFsConfig;
    }

    public CreateFunctionInput setLayers(java.util.List<String> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<String> getLayers() {
        return this.layers;
    }

    public CreateFunctionInput setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public CreateFunctionInput setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public CreateFunctionInput setMicroSandboxConfig(MicroSandboxConfig microSandboxConfig) {
        this.microSandboxConfig = microSandboxConfig;
        return this;
    }
    public MicroSandboxConfig getMicroSandboxConfig() {
        return this.microSandboxConfig;
    }

    public CreateFunctionInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateFunctionInput setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    public CreateFunctionInput setPolarFsConfig(PolarFsConfig polarFsConfig) {
        this.polarFsConfig = polarFsConfig;
        return this;
    }
    public PolarFsConfig getPolarFsConfig() {
        return this.polarFsConfig;
    }

    public CreateFunctionInput setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFunctionInput setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateFunctionInput setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public CreateFunctionInput setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public CreateFunctionInput setSessionAffinityConfig(String sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
        return this;
    }
    public String getSessionAffinityConfig() {
        return this.sessionAffinityConfig;
    }

    public CreateFunctionInput setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public CreateFunctionInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateFunctionInput setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public CreateFunctionInput setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
